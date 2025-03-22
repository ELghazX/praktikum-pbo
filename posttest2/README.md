# Posttest 2

## MOHON BACA README

INSTRUKSI
1. Lanjutkan project posttest sebelumnya,  buat folder baru Posttest2 dan copy file posttest sebelumnya ke folder baru (jika memang tidak ubah judul).
2. Terapkan Konsep Encapsulation, minimal terdapat 2 penerapan dari 4 jenis Access Modifier
3. Terapkan metode Setter dan Getter
4. Dikumpul melalui github, diclassroom hanya link repository terkait

## Cara menjalankan program

Posttest ini dibuat menggunaakn build automation Apache Maven

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
setelah berada di direktori praktikum-pbo/posttest2
jalankan perintah di shell 
```shell
mvn clean package assembly:single
```
untuk build dengan plugin assembly
kemudian jalankan program dengan
```shell
java -jar posttest2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## menjalankan dengan Docker
pastikan dah ada Docker dan docker server nya nyala
build docker image di praktikum-pbo/posttest2 dengan
```shell
docker build -t posttest2-ghazali .
```
lalu jalankan container dengan
```shell
docker run -rm posttest2-ghazali
```
