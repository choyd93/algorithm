process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = data.split(" ");
  const a = Number(n[0]),
    b = Number(n[1]);
  const arr = [];

  for (let i = 1; i <= a; i++) {
    arr.push("*");
  }

  for (let j = 1; j <= b; j++) {
    console.log(arr.join(""));
  }
});
