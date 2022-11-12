
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

async function Reserva(){

var dia = document.getElementById("diaReserva").value;
var hora = document.getElementById("horaReserva").value;
var email = document.getElementById("123456").value;
var reserva = {correo:email,dia:dia,hora:hora};
    const request2 = await fetch('api/reserva', {
        method: "Post",
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'

        },

        body: JSON.stringify(reserva)

    });

    const respuesta2 = await request2.text();
    if (respuesta2 == 'OK'){
        alert("Su reserva se realizo con exito")
    }else{
        alert ("Fallo en elaborar la reserva")
    }

}