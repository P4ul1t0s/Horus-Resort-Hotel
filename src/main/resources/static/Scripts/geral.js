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
