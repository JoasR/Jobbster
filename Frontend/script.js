const menuBtn = document.getElementById("menuBtn");
const navBar = document.getElementById("navbar");
const menu = document.getElementById("menu");
const body = document.body;
let menuHidden = true;

menuBtn.addEventListener("click", () => {
    if(menuHidden){
        navBar.style.background = "#232b2b";
        menu.style.width = "100%";
        menuHidden = false;
        body.style.overflow = "hidden";
    } else if (window.scrollY === 0){
        navBar.style.background = "transparent";
        menu.style.width = "0%";
        menuHidden = true;
        body.style.overflow = "visible";
    } else {
        navBar.style.background = "#232b2b";
        menu.style.width = "0%";
        menuHidden = true;
        body.style.overflow = "visible";
    }
})

window.addEventListener("resize", openCloseHamburger);

function openCloseHamburger(){
    if(document.documentElement.clientWidth > 1299){
        menu.style.width = "100%";
    } else if (document.documentElement.clientWidth < 1300 && menuHidden){
        menu.style.width = "0%";
    } else {
        menu.style.width = "100%";
    }
}

window.addEventListener("scroll", () => {
    if(document.body.scrollTop || document.documentElement.scrollTop > 50){
        navBar.style.background = "#232b2b";
    } else {
        navBar.style.background = "transparent";
    }
})