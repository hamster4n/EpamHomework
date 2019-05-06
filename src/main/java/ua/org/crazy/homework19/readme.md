Домашнее задание часть 2

1. Нужно написать реалиазцию  интерфейса MyList на основе массива и двусвязного списка.
   Смотреть https://github.com/Anderwerty/testProject/tree/master/src/main/java/org/lesson/lesson18/list
   Не забываем про написание тестов. В идеале следует выполнить задание используя принцип TDD.
   Подумайте, возможно нужно спользовать абстрактный класс.

   Предварительно ознакомтесь:
   https://habr.com/ru/users/tarzan82/posts/ 4 статьи 

2. Написать реализацию методов equals и hashCode для класс User не прибегая к автогенерации этих методов.

public class User{
private String name;
private String surname;
private Address address;
private LocalDate birthday;
private int index;
private Sex sex;

// constructor +setters+getters

}
public class Address{
private String city;
//....
}
public emun Sex{
//..
}

3. Рассмотрим предметный класс Artists, который представляет группу исполнителей. Ваша задача - переработать
метод getArtist, так чтобы он возвращал объектOptional <Artist>. Этот объект должен содержать элемент, если
индекс допустимый, и быть пустым в противном случае. Не забудьте,что придется также переработать метод getArtistName,
сохранив при этом прежнее поведение.

public class Artists {
private List<Artist> artists;
public Artists(List<Artist> artists) {
this.artists = artists;
}
public Artist getArtist(int index) {
if (index < 0 || index >= artists.size()) {
indexException(index);
}
return artists.get(index);
}
private void indexException(int index) {
throw new IllegalArgumentException(index +
" doesn't correspond to an Artist");
}

public String getArtistName(int index) {
try {
Artist artist = getArtist(index);
return artist.getName();
} catch (IllegalArgumentException e) {
return "unknown";
}
}
}
