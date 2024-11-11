<script>
function showConfirmation(event) {
    event.preventDefault(); // Evita que el formulario se envíe y recargue la página
    document.querySelector('.confirmation-message').style.display = 'block'; // Muestra el mensaje
}
</script>