function calcularIMC(){
       var peso=document.getElementById("peso").value
       var altura = document.getElementById("altura").value
       var IMC = (peso/(altura**2))*10000;
       var DIV = document.getElementById("IMC")

       const text = document.createElement("p")
       const textnode = document.createTextNode("Tu indice de masa corporal es" + "\t"+ IMC)
       text.appendChild(textnode);
       text.setAttribute("class","m-0 text-white")
       text.setAttribute("id","textIMC")
       DIV.appendChild(text);
       setTimeout(eliminar,3000)

   }
   function eliminar() {
      document.getElementById("textIMC").remove()
   }



