const menuExpandido = document.querySelector(".expandido")
        const menuComprimido = document.querySelector(".comprimido")
        const menu = document.querySelector(".menu")

        function openOrCloseMenu(){
            if(menu.getAttribute("class").includes("comprimido")){
                openMenu()
            } else{
                closeMenu()
            }
        }        
        
        function openMenu(){
            menuComprimido.classList.remove("comprimido")
            menuComprimido.classList.add("expandido")

            document.querySelector(".menu h3").innerText = "Hórus System"
            document.querySelector(".menu h4").innerText = "nome funcionario"
            document.querySelector(".menu h5").innerText = "32/05/2022 - 21:04"
        }

        function closeMenu(){
            menuComprimido.classList.remove("expandido")
            menuComprimido.classList.add("comprimido")

            document.querySelector(".menu h3").innerText = ""
            document.querySelector(".menu h4").innerText = ""
            document.querySelector(".menu h5").innerText = ""
        }
        
        document.querySelectorAll(".objetos").forEach(blocoFuncionario =>{
            let idFuncionario = blocoFuncionario.firstElementChild.innerText
            let nomeFuncionario = blocoFuncionario.firstElementChild.nextElementSibling.innerText
            let cargoFuncionario = blocoFuncionario.firstElementChild.nextElementSibling.nextElementSibling.innerText
            let emailFuncionario = blocoFuncionario.lastElementChild.previousElementSibling.innerText
            let senhaFuncionario = blocoFuncionario.lastElementChild.innerText
            
            blocoFuncionario.addEventListener("click", ()=>{
                document.querySelector("#selected-id").innerText = idFuncionario
                document.querySelector("#selected-nome").value = nomeFuncionario
                document.querySelector("#selected-cargo").value = cargoFuncionario
                document.querySelector("#selected-email").value = emailFuncionario
                document.querySelector("#selected-senha").value = senhaFuncionario
            })
        })//end for each


//======================AJAX==============================

function listaFuncionarios() {
    let funcionarios = ""
    $.ajax({
        type: "GET", 
        dataType: "json", 
        url:"/funcionario",
        success: function(arrayFuncionarios){
            for (let funcionario of arrayFuncionarios) {
                funcionarios +=`<li class="objetos">
                                    ${funcionario.nome}
                                </li>`
            }
            $("#lista-funcionarios").append(funcionarios)
        },
        error: function(){
            
        },
        beforeSend: function(){
            
        }
    })
}
