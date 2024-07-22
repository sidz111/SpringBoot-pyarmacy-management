# SpringBoot-pyarmacy-management

## Frontend of WebApp

![Screenshot (239)](https://github.com/user-attachments/assets/a968cf4f-7742-47f8-8b27-650b24d4ef1e)

![Screenshot (240)](https://github.com/user-attachments/assets/db59ec9d-5fc2-4a8d-8ea6-7e70bb924149)

![Screenshot (241)](https://github.com/user-attachments/assets/1d6d77ce-13a1-4936-8e8d-2c25e3d8de3c)

![Screenshot (242)](https://github.com/user-attachments/assets/ff7f60ca-ebbf-4232-be76-44d19e05836f)

![Screenshot (243)](https://github.com/user-attachments/assets/bfdec2c6-a53d-4423-a973-caf58c279adc)

![Screenshot (244)](https://github.com/user-attachments/assets/f9be6e44-868d-4aaf-ba8e-e3da9e48f2db)

![Screenshot (245)](https://github.com/user-attachments/assets/d4b48893-232a-4625-9f5a-aa9ed7a626fa)

![Screenshot (246)](https://github.com/user-attachments/assets/093c01a3-f20c-4994-97df-670fb201a265)



This project is a web application that generates invoices for pharmacy customers. It allows users to input customer details and add multiple drugs to the invoice. The application calculates the total amount and generates a PDF of the invoice using jsPDF.

## Features

- Add customer details: name, contact, address, age, and gender.
- Add multiple drugs to the invoice with their ID, name, quantity, and price.
- Calculate the total amount of the invoice.
- Generate a PDF of the invoice.

## Technologies Used

- HTML
- CSS
- JavaScript
- Bootstrap 5
- jsPDF


## Instructions

1. Open the application in your web browser.
2. Fill in the customer details.
3. Add drugs to the invoice by entering their ID, name, quantity, and price.
4. Click the "Add Row" button to add more drugs.
5. Click the "Calculate Total" button to calculate the total amount of the invoice.
6. Click the "Generate PDF" button to download the invoice as a PDF file.

## Code Explanation

### Frontend

#### HTML Structure

The HTML file includes:
- A navbar
- A form for entering customer details
- A table for adding drugs to the invoice
- Buttons to add rows, calculate the total, and generate the PDF

#### CSS Styling

The CSS styles apply a modern and visually appealing design with a dark theme and vibrant colors. The styling is done using Bootstrap classes and custom CSS.

#### JavaScript Functionality

- **Calculate Total**: Calculates the total amount of the invoice based on the quantity and price of each drug.
- **Add Row**: Adds a new row to the table for adding more drugs to the invoice.
- **Delete Row**: Deletes a row from the table.
- **Generate PDF**: Generates a PDF of the invoice using jsPDF, including customer details and the list of drugs.

### Backend

#### Controllers

- **`homeController`**:
  - Handles the routing for different pages (`home`, `info`, `AskExpert`, `invoice`).
  - Submits questions via email using the `HomeService` bean.

- **`StockController`**:
  - Manages stock-related operations, including creating, viewing, editing, deleting, and searching for stocks.
  - Provides a dashboard with statistical data and analysis on stock quantities, prices, and categories.

- **`SupplierController`**:
  - Manages supplier-related operations, including creating, viewing, editing, deleting, and searching for suppliers.
  - Handles sending emails to suppliers for drug requests.

#### Services

- **`HomeService`**:
  - Provides functionality to send emails using `JavaMailSender`.

- **`StockService`**:
  - Contains methods to fetch and analyze stock data, such as total stocks, expired drugs, and stock quantity distribution.

- **`SupplierService`**:
  - Contains methods to filter suppliers and send emails to them regarding drug requests.

#### Data Models

- **`Stock`**: Represents drug stock information including drug name, category, manufacturer, quantity, price, etc.
- **`Supplier`**: Represents supplier information including supplier name, email, contact details, and drugs supplied.

#### Repositories

- **`StockRepository`**: Provides CRUD operations for `Stock` entities.
- **`SupplierRepository`**: Provides CRUD operations for `Supplier` entities.

## Technologies Used

- **Frontend**: HTML, CSS (Bootstrap), JavaScript (jsPDF)
- **Backend**: Java, Spring Boot, JavaMailSender
- **Database**: H2 Database (if used)
- **Build Tool**: Maven or Gradle (depending on the project configuration)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Thanks to the developers of [jsPDF](https://github.com/parallax/jsPDF) for providing the PDF generation library.
- Thanks to the [Spring Boot](https://spring.io/projects/spring-boot) community for the robust framework.
