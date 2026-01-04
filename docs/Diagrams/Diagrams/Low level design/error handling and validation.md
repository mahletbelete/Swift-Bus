# Error Handling in Your System

Error handling ensures that your application can detect, report, and recover from unexpected situations without crashing. In your system (bus ticketing), common errors may include:

## A. User/Passenger Errors

- Invalid login credentials.
- Registration with incomplete or invalid information (e.g., missing email or phone number).
- Attempting to make a booking without sufficient balance.
- Trying to change a password with wrong current password.

**Implementation:**
- Use try-catch blocks (in Java) or equivalent constructs to capture exceptions.
- Return meaningful error messages to the user.

**Example:**
```java
try {
    passenger.login(username, password);
} catch(InvalidCredentialException e) {
    System.out.println("Error: Invalid username or password.");
}
```

## B. Booking Errors

- Booking a seat that is already reserved.
- Invalid route or ticket selection.
- Payment failure (insufficient balance or invalid payment method).

**Implementation:**
- Check seat availability before confirming booking.
- Verify payment status before marking booking as complete.

**Example:**
```java
if(!seat.isAvailable()) {
    throw new SeatNotAvailableException("Seat is already reserved.");
}
```

## C. System Errors

- Database connection failure.
- Unexpected null values or invalid object references.
- File read/write errors for logs or configuration.

**Implementation:**
- Use logging frameworks (e.g., Log4j in Java) to log errors.
- Gracefully terminate processes if critical errors occur.


---

# 2. Validation in Your System

Validation ensures that user input or system data is correct before processing. This reduces errors and improves data integrity.

## A. Input Validation

- **User Inputs:** Check email format, password strength, phone number format.
- **Booking Inputs:** Validate seat numbers, payment details, and route IDs.
- **Payment Inputs:** Check that amount is positive, payment method is valid, and date is correct.

**Example (Java):**
```java
public boolean validateEmail(String email) {
    return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
}

public boolean validatePaymentAmount(double amount) {
    return amount > 0;
}
```

## B. Business Logic Validation

- Prevent users from booking more than one seat per ticket if the rules disallow it.
- Ensure only admins can create or delete routes and buses.
- Validate ticket status before generating or canceling tickets.

**Example:**
```java
if(ticket.isValidated()) {
    throw new InvalidOperationException("Ticket is already validated.");
}
```

## C. Cross-Class Validation

When booking, ensure:
- Seat belongs to the selected bus.
- Bus operates on the selected route.
