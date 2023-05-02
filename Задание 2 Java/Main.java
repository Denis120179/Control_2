import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

 public static void main(String[] args) {
 //Cоздаем игрушки
 Toy soldier = new Toy(1, "soldier", 20, 2);
 Toy car = new Toy(2, "car", 10, 3);
 Toy bear = new Toy(3, "bear", 6, 10);
 Toy gun = new Toy(4, "gun", 10, 3);
 Toy tank = new Toy(5, "tank", 6, 15);
 Toy boll = new Toy(6, "boll", 25, 3);

 //Добавляем созданные игрушки в список (в обычный непризовой) с новым весом
 addToListWithNewWeight(soldier, 5);
 addToListWithNewWeight(car, 5);
 addToListWithNewWeight(bear, 15);
 addToListWithNewWeight(gun, 7);
 addToListWithNewWeight(tank, 25);
 addToListWithNewWeight(boll, 6);

 //Показываем общий список игрушек
 System.out.println("all toys: ");
 showNewList(Toys.allToys);

 //Формируем список призовых игрушек (например, с весом от 15)
 List<Toy> addedWinners = selectToyByMinWeight(Toys.allToys, 15);
 Toys.winsToys.addAll(addedWinners);

 //Показываем список призовых игрушек
 System.out.println("winners list: ");
 showNewList(Toys.winsToys);

 //Рандомно выбираем приз
 Toy givedWinner = selectRandomToy(Toys.winsToys);

 //Удаляем приз из списка
 Toys.winsToys.remove(givedWinner);

 //Показываем данные о призовой игрушке
 System.out.println("winner for giving: " + givedWinner.info());

 //Записываем данные в текстовый файл
 MyFile.writeToy(givedWinner);

    }

 private static List<Toy> selectToyByMinWeight(ArrayList<Toy> allToys, int minWeight) {
 List<Toy> result = new ArrayList<>();
 for (Toy currentToy : allToys) {
 if (currentToy.getWeight() <= minWeight) {
 result.add(currentToy);
            }
        }
 return result;
    }

 private static Toy selectRandomToy(ArrayList<Toy> winsToys) {
 Random rand = new Random();
 int winnerElement = rand.nextInt(winsToys.size());
 return winsToys.get(winnerElement);
    }

 private static void addToListWithNewWeight(Toy newToy, int newWeight) {
 newToy.setWeight(newWeight);
 Toys.allToys.add(newToy);
    }

 private static void showNewList(ArrayList<Toy> myList) {
 int winListSize = myList.size();
 for (int i = 0; i < winListSize; i++) {
 System.out.print("toy [" + i + "]: " + myList.get(i).getName() + ", ");
        }
 System.out.println("");
    }
}