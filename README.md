# IT-project

My IT Project for class 12 CBSE board, IT (802)
The repository consists of 15 JAVA + 15 MYSQL unique Programs that one can submit in their Class 12 CBSE IT(802) Practical

You can download the pdf of both through:
[15 MYSQL PDF](https://github.com/19akshansh/IT-project/blob/2bab3e40dabda5d7fdd2f7906ecdebbee210dfad/JAVA/15%20JAVA%20PROGRAMS.pdf)
[15 JAVA PDF](https://github.com/19akshansh/IT-project/blob/2bab3e40dabda5d7fdd2f7906ecdebbee210dfad/MYSQL/15%20MYSQL%20QUERIES.pdf)


## Running JAVA in Github Codespaces:

Install:

```bash
sudo apt update
sudo apt install -y openjdk-25-jdk
```

Check Installation:

```bash
java -version
javac -version
```

Make a file:

`.devcontainer/devcontainer.json`:

```json
{
  "name": "Java Codespace",
  "image": "mcr.microsoft.com/devcontainers/java:25"
}
```

Switch to the JAVA Programs directory & Run any java program(say AreaCircle for now)

```bash
cd JAVA/programs
java ./AreaCircle.java
```

## Running MYSQL in Github Codespaces/VScode


Install:

```bash
sudo apt update
sudo apt install mysql-server -y
```

Start MYSQL, Check Status & Login:

```bash
sudo service mysql start # start
sudo service mysql status # check status
sudo mysql # login
```
