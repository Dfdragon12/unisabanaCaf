$(document),ready(function(){
    // on ready
});


async function iniciarSesion(){
    var Email = document.getElementById('txtEmail').value;
    var Password = document.getElementById('txtPass').value;
    let datos = {};
    datos.email = Email;
    datos.password = Password;



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