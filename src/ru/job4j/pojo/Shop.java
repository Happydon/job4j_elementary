package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
       int key = -1;
       for (int i = 0; i < products.length; i++) {
          Product product = products[i];
          /* проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком. */
           if (product == null) {
              key = i;
              break;
          }
       }
       return key;
    }
}
