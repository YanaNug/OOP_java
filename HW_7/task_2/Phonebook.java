package OOP_java.HW_7.task_2;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Phonebook {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        
        System.out.println("Добро пожаловать в телефонный справочник!");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Найти контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Показать все контакты");
            System.out.println("5. Экспортировать контакты");
            System.out.println("6. Импортировать контакты");
            System.out.println("7. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContacts();
                    break;
                case 5:
                    exportContacts();
                    break;
                case 6:
                    importContacts();
                    break;
                case 7:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.next();
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        System.out.println("Контакт добавлен: " + contact.getName() + " - " + contact.getPhoneNumber());
    }

    private static void findContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.next();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Номер телефона: " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Контакт не найден!");
    }

    private static void deleteContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.next();
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                System.out.println("Контакт удален: " + contact.getName() + " - " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Контакт не найден!");
    }

    private static void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Справочник пуст!");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
            }
        }
    }

    private static void exportContacts() {
        System.out.print("Введите имя файла для экспорта: ");
        String filename = scanner.next();
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (Contact contact : contacts) {
                writer.println(contact.getName() + "," + contact.getPhoneNumber());
            }
            System.out.println("Контакты экспортированы в файл " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл " + filename + " не найден!");
        }
    }

    private static void importContacts() {
        System.out.print("Введите имя файла для импорта: ");
        String filename = scanner.next();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    Contact contact = new Contact(name, phone);
                    contacts.add(contact);
                }
            }
            System.out.println("Контакты импортированы из файла " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл " + filename + " не найден!");
        }
        scanner.close();
    }
}

