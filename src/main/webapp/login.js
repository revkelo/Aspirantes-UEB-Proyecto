function validarFormulario(event) {
  event.preventDefault(); // Detenemos el comportamiento predeterminado del formulario
  
  var usuario = document.getElementById("usuario").value;
  var password = document.getElementById("pwd").value;
  
  if(usuario === "admin" && password === "admin") {
    var data = {
      usuario: usuario,
      password: password
    };
    
    fetch('http://localhost:8080/UEB1/tabla', {
      method: "POST"
    }).then(response => {
      if(response.ok) {
        window.location.href = "/UEB1/tabla";
      } else {
        alert("Error al enviar datos al servidor");
      }
    });
    
   
  } else {
    alert("Usuario o contraseña incorrectos");
  }
}
