# Posttest 5 Mohon Baca Readme

## Cara menjalankan program

Posttest ini dibuat menggunakan build automation Apache Maven

Cara menjalankan program

- Clone repository ini

```shell
git clone 'https://github.com/ELghazX/praktikum-pbo.git'
```

- Masuk ke direktori posttest5/

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

kemudian compile 

```shell
mvn clean compile
```

kemudian jalankan program dengan

```shell
mvn exec:java
```


## menjalankan dengan Docker

pastikan dah ada Docker dan docker server nya nyala
kemudian masuk ke praktikum-pbo/posttest2/

build docker image di praktikum-pbo/posttest2 dengan

```shell
docker build -t posttest5-ghazali .
```

lalu jalankan container dengan

```shell
docker run -it --rm posttest5-ghazali
```
