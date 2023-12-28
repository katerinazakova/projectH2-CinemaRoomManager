# Cinema Room Manager
Create an application that helps manage a cinema theatre: sell tickets, check available seats, view sales statistics.

## 1. stage
Create visualize the seating arrangement by printing the scheme to the console. Your output should be contain 9 lines, the title "Cinema:" - 1 line and room size - 8 lines.

## 2. stage
In this stage, you need to read two positive integer numbers from the input: the number of rows and the number of seats in each row. Calculate the profit from all the sold tickets depending on the number of available seats.The ticket price is determined by the following rules:

If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. The number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the other 5 rows.

## 3. stage
Implement the opportunity to check the ticket price and see the reserved seat.
Read two positive integer numbers that represent the number of rows and seats in each row and print the seating arrangement. Then, read two integer numbers from the input: a row number and a seat number in that row. These numbers represent the coordinates of the seat according to which the program should print the ticket price.After that, the program should print out all the seats in the screen room and mark the chosen seat by the B symbol. Finally, it should print the ticket price and stop. 

## 4. stage
Add a menu that will allow to buy tickets and display the current state of the seating arrangement when needed. At the start, your program should read two positive integer numbers that represent the number of rows and seats in each row. Then, it should print a menu with the following three items:

"Show the seats" should print the current seating arrangement. The empty seats should be marked with an S symbol, and taken seats are marked with a B symbol.

"Buy a ticket" should read the seat coordinates from the input and print the ticket price like in the previous stage. After that, the chosen seat should be marked with a B when the item Show the seats is called.

"Exit" should stop the program.

## 5. stage
Add statistics to your program. The stats will show the current income, total income, the number of available seats, and the percentage of occupancy. When the item Statistics is chosen, your program should print the following information:

The number of purchased tickets;
The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
Current income;
The total income that shows how much money the theatre will get if all the tickets are sold.

The rest of the menu items should work the same way as before, except the item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print That ticket has already been purchased! and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print Wrong input! and ask to enter different seat coordinates until the user picks an available seat.
