# System Manajemen Membership Gym
Entitas = 
- Admin
- Member
- Fasilitas
- Pembayaran
- Riwayat

Untuk posttest ini yang akan di CRUD adalah entitas Member 

## Cara menjalankan di path ```praktikum-pbo/posttest1/```

### Linux :

```javac -d out $(find . -name "*.java") && java -cp out App```

### Docker :

```docker build -t java-app .```

Kemudian


```docker run --rm -it java-app```


### Windows? (mungkin) :

cmd shell

```javac -d out src\**\*.java``` 

kemudian

```java -cp out App```
