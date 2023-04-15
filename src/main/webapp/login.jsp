<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Autenticación de administrador</title>
    <script src="admin-login.js"></script>
  </head>
  <body>
    <h2>Inicie sesión como administrador</h2>
    <form method="post" action="/UEB1/admin">
      <label for="username">Usuario:</label>
      <input type="text" id="username" name="username"><br>

      <label for="password">Contraseña:</label>
      <input type="password" id="password" name="password"><br>

      <input type="submit" value="Iniciar sesión">
    </form>
  </body>
</html>
