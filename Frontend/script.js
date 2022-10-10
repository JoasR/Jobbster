const menuBtn = document.getElementById("menuBtn");
const navBar = document.getElementById("navbar");
const menu = document.getElementById("menu");
let menuHidden = true;

menuBtn.addEventListener("click", () => {
    if(menuHidden){
        menu.style.width = "100%";
        menuHidden = false;
    } else {
        menu.style.width = "0%";
        menuHidden = true;
    }
})

window.addEventListener("resize", () => {
    if(window.screen.width > 1023){
        menu.style.width = "100%";
        menuHidden = false;
    } else {
        menu.style.width = "0%";
        menuHidden = true;
    }
})

window.addEventListener("scroll", () => {
    if(document.body.scrollTop || document.documentElement.scrollTop > 50){
        navBar.style.background = "#232b2b";
    } else {
        navBar.style.background = "transparent";
    }
})