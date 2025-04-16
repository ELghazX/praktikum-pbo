# Posttest 4 Mohon Baca Readme

## Cara menjalankan program

Posttest ini dibuat menggunakan build automation Apache Maven

Cara menjalankan program

- Clone repository ini

```shell
git clone 'https://github.com/ELghazX/praktikum-pbo.git'
```

- Masuk ke direktori posttest2/

```shell
cd posttest2
```

## menjalankan dengan Maven

pastikan maven terinstall dulu ya....
kemudian pastikan punya setidaknya JDK versi 21 (kalau error silahkan ubah versi menyesuaikan di [pom.xml](pom.xml))

```shell
󰣇 elghaz Sedang Ngodonf on ~ ........................................
 javac --version
javac 23.0.2
```

setelah berada di direktori praktikum-pbo/posttest2
jalankan perintah di shell

jaga jaga reload dependencies dari pom.xml

```shell
mvn clean install
```

kemudian compile menjadi jar dengan plugin assembly

```shell
mvn clean package assembly:single
```

kemudian jalankan program dengan

```shell
java -jar target/posttest2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## menjalankan dengan Docker

pastikan dah ada Docker dan docker server nya nyala
kemudian masuk ke praktikum-pbo/posttest2/

build docker image di praktikum-pbo/posttest2 dengan

```shell
docker build -t posttest2-ghazali .
```

lalu jalankan container dengan

```shell
docker run -it --rm posttest2-ghazali
```
