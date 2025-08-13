The main source code is available in the src section in the folder "cc"


➢ 📅 Century Calendar – Java Program
    • This Java program determines the day of the week for any given date between 1 January 2001 and 31 December 2100.
    • It uses a predefined century calendar logic based on year codes and month codes, without relying on built-in date/time libraries.

➢ How It Works:

1. User Input
  • The program prompts the user to enter a date in the format:
    DD-MM-YYYY
    
  • The input is validated for:
    • Correct day range (1–31)
    • Correct month range (1–12)
    • Year within 2001–2100

2. Year Code Calculation (yearCode method)
  • Uses a preloaded mapping of each year in the range 2001–2100 to a unique year code (A–N).
  • This mapping allows quick lookup of the base offset for the year.

3. Month Code Calculation (monthCode method)
  • Uses the year code and month number to fetch the month’s numeric code from pre-defined arrays.
  • Different year codes have different month code tables.

4. Weekday Determination (getWeek method)
  • Combines the month code and day of the month to determine the weekday.
  • Uses an indexed list of weekdays:
      Monday → Tuesday → ... → Sunday → (repeats)
  • The offset ensures the right weekday is chosen for the given date.

5. Output
  • Prints the result in the format:
      DD-MM-YYYY is <Weekday>

  
➢ Example Run:

  Enter date, month and year within the range of 2001 to 2100 years in the form of DD-MM-YYYY: 15-08-2025
  15-8-2025 is Friday

  
➢ Key Features

 • Works offline without external libraries.
 • Covers the entire 21st century (2001–2100).
 • Accurate weekday calculation using static lookup tables.
 • Simple input validation.
 • Custom algorithm instead of built-in Java date utilities.

➢ File Structure
    Main.java
  
  Contains:
   • main – Handles input/output and validation.
   • yearCode – Finds the year’s code letter.
   • monthCode – Finds the numeric code for the month/year combination.
   • getWeek – Determines the final weekday name.
