const submitButton = document.getElementById("submit-job");
let files = "";
const fileSelector = document.getElementById("imageupload");
fileSelector.addEventListener("change", (event) => {
    files = event.target.files;
    console.log(files);
});

submitButton.addEventListener("click", () => {
    const formData = new FormData();
    formData.append("image", files[0]);
    fetch("http://localhost:8080/api/v1/upload/image", {
  method: "POST",
  body: 
    formData
  ,
})
  .then((response) => response.json())
  .then((json) => console.log(json));
});