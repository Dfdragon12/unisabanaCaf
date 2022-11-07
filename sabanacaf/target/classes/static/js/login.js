
async function iniciarSesion(){
    var email = document.getElementById("123456").value;
    var password = document.getElementById('txtPass').value;
    var datos = {correo:email,password:password};

    const request = await fetch('api/login', {
        method: "Post",
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'

        },

        body: JSON.stringify(datos)

    });

    const respuesta = await request.text();
    if (respuesta == 'OK'){
        window.location.href = 'index.html'
    }else{
        alert ("Las credenciales no coinciden")
    }

}