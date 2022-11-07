$(document),ready(function(){
    // on ready
});


async function iniciarSesion(){
    let datos = {};

    datos.email = document.getElementById('txtPass').value;
    datos.password = document.getElementById('txtPass').value;



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