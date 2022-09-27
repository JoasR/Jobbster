const ghostSignUpButton = document.getElementById('signUp');
const ghostSignInButton = document.getElementById('signIn');
const container = document.getElementById('container');
const signUpButton = document.getElementById("signupbtn");

let firstName = "";
let lastName = "";
let email = "";
let password = "";

ghostSignUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

ghostSignInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});



signUpButton.addEventListener("click", () => {
firstName = document.getElementById("firstname").value;
lastName = document.getElementById("lastname").value;
email = document.getElementById("email").value;
password = document.getElementById("password").value;


    fetch("http://localhost:8080/api/v1/registration", {
  method: "POST",
  body: JSON.stringify({
    firstName: firstName,
    lastName: lastName,
    email: email,
    password: password,
  }),
  headers: {
    "Content-type": "application/json; charset=UTF-8",
  },
})
  .then((response) => response.text())
  .then((text) => console.log(text));
})