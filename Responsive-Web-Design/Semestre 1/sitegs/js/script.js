const toggleButton = document.getElementsByClassName('toggle-button')[0]
const navbarLinks = document.getElementsByClassName('navbar-links')[0]

toggleButton.addEventListener('click', () => {
    if(navbarLinks.classList.contains("--visible"))
        navbarLinks.classList.remove("--visible")
    else
        navbarLinks.classList.add("--visible")
})