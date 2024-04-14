import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Novel novel = new Novel("Мертвые души", "Николай Гоголь", 1842, "роман");
//        Detective detective = new Detective("Шерлок холмс", "Конан Дойл", 1927, "детектив");
//        Fantasy fantasy = new Fantasy("Амереканские боги", "Нил Гейман", 2001, "роман");

        Scanner scanner = new Scanner(System.in);
        Book[] library = new Book[100];
        library[0] = new Novel("Мертвые души", "Николай Гоголь", 1842, "роман");
        library[1] = new Detective("Шерлок холмс", "Конан Дойл", 1927, "детектив");
        library[2] = new Fantasy("Амереканские боги", "Нил Гейман", 2001, "роман");
        int choice;
        int totalBooks = 0;
        do {
            System.out.println("1.Добавить книгу");
            System.out.println("2.Просмотреть все книги");
            System.out.println("3.Выйти");
            System.out.println("Ввести свой выбор");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите тип книги( 1 - Роман, 2 - Детектив, 3 - Фэнтези): ");
                    int bookType = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Напишите название: ");
                    String title = scanner.nextLine();
                    System.out.println("Напишите автора: ");
                    String author = scanner.nextLine();
                    System.out.println("Напишите год: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    switch (bookType) {
                        case 1:
                            System.out.println("Напишите жанр: ");
                            String genre = scanner.nextLine();
                            new Novel(title, author, year, genre);
                            totalBooks++;
                            break;
                        case 2:
                            System.out.println("Напишите тип детектива: ");
                            String detectiveType = scanner.nextLine();
                            new Detective(title, author, year, detectiveType);
                            totalBooks++;
                            break;
                        case 3:
                            System.out.println("Напишите под жанр");
                            String subgenre = scanner.nextLine();
                            new Fantasy(title, author, year, subgenre);
                            totalBooks++;
                            break;
                        default:
                            System.out.println("Неверный жанр книги");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Все книги в библиотеке: ");
                    for (Book book : library) {
                        if (book != null) {
                            book.getInfo();
                        }
                    }
//                    System.out.println(Book.getTotalBooks());
                    break;
                case 3:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный выбор! Пожалуйста введите заново");
                    break;
            }
        } while (choice != 3);
    }
}