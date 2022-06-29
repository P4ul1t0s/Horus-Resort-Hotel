let listaReservas = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/reservas",
    success: function(arrayReservas){
        for (let reserva of arrayReservas) {
            listaReservas +=`<li class="objetos">
                                ${reserva.status}
                                ${reserva.checkin}
                                ${reserva.checkout}
                                ${reserva.adultos}
                                ${reserva.criancas}
                                ${reserva.valorTotal}
                            </li>`
        }
        $("#lista-reserva").append(listaReservas)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})

function cadastrar(){
    var idQuarto = document.getElementById("idQuarto").value;
    location.href="/back/reserva/salvar"+idQuarto;
}
