# Posttest 2 Mohon Baca Readme

<!--toc:start-->
- [Posttest 2 Mohon Baca Readme](#posttest-2-mohon-baca-readme)
  - [Instruksi Posttest](#instruksi-posttest)
  - [Cara menjalankan program](#cara-menjalankan-program)
  - [menjalankan dengan Maven](#menjalankan-dengan-maven)
  - [menjalankan dengan Docker](#menjalankan-dengan-docker)
<!--toc:end-->

## Instruksi Posttest

1. Lanjutkan project posttest sebelumnya,  buat folder baru Posttest2 dan copy file posttest sebelumnya ke folder baru (jika memang tidak ubah judul).
2. Terapkan Konsep Encapsulation, minimal terdapat 2 penerapan dari 4 jenis Access Modifier 3. Terapkan metode Setter dan Getter
4. Dikumpul melalui github, diclassroom hanya link repository terkait

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
