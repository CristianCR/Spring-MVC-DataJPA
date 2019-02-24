$(document).ready(init);

function init(){
    $.ajax({
        url: '/SpringMVC-DataJPA/getAllUsers',
        success: function(data) {
            for(i = 0; i<data.length; i++) {
                $("#users").append("<li>" + data[i].name + "</li>");
            }
        },
        error: function() {
            alert("No se ha podido obtener la información.");
        }
    });
}
