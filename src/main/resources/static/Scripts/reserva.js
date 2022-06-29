let listaReservas = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/reservas",
    success: function(arrayReservas){
        for (let reserva of arrayReservas) {
            listaReservas +=`<li class="objetos">
                                ${listaReservas.status}
                                ${listaReservas.checkin}
                                ${listaReservas.checkout}
                                ${listaReservas.adultos}
                                ${listaReservas.valorTotal}
                            </li>`
        }
        $("#lista-reserva").append(listaReservas)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})
