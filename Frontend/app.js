const showHere = document.getElementById("showAllJobsHere");

fetch("http://localhost:8080/api/v1/task")
  .then((response) => response.json())
  .then((data) => {
    data.forEach((task) => {
      const job = `<li>
      <h2>${task.id}</h2>
      <h3>${task.title}</h3>
      <h4>Category: ${lowerCaseAllExceptFirst(task.category)}</h3>
      <p>
          ${task.description}
      </p>
      <p>
        ${formatDateTime(task.postDate)}
      </p>
      <button onclick="moreBtnFunction()">Read more</button>
  </li>`;
      showHere.innerHTML += job;
    });
  });

function moreBtnFunction(){
    console.log("The more button has been clicked");
    window.alert("The more button has been clicked");
}

function lowerCaseAllExceptFirst(string) {
  return string.replaceAll(
    /\S*/g,
    (word) => `${word.slice(0, 1)}${word.slice(1).toLowerCase()}`
  );
}

function formatDateTime(dateFromFetch){
    let date = new Date();
    date.setUTCFullYear = dateFromFetch.slice(0, 4);
    date.setUTCMonth = dateFromFetch.slice(5, 7);
    date.setUTCDate = dateFromFetch.slice(8, 10);
    date.setUTCHours = dateFromFetch.slice(11,13);
    date.setUTCMinutes = dateFromFetch.slice(14, 16);
    date.setUTCSeconds = dateFromFetch.slice(17);
    return date.toLocaleString();
}