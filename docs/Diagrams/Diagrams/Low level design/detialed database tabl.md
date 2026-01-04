# 1️⃣ User Table

| Column   | Type    | Key | Notes                  |
| -------- | ------- | --- | ---------------------- |
| userId   | INT     | PK  | Unique user ID         |
| name     | VARCHAR |     | User full name         |
| email    | VARCHAR |     | Login email            |
| phone    | VARCHAR |     | Contact number         |
| password | VARCHAR |     | Hashed password        |
| role     | VARCHAR |     | “Passenger” or “Admin” |

---

# 2️⃣ Passenger Table

| Column                 | Type    | Key               | Notes                  |
| ---------------------- | ------- | ----------------- | ---------------------- |
| passengerId            | INT     | PK                | Unique passenger ID    |
| userId                 | INT     | FK → User(userId) | Links to User table    |
| walletBalance          | DOUBLE  |                   | Current wallet balance |
| preferredPaymentMethod | VARCHAR |                   | e.g., Card, Mobile     |

---

# 3️⃣ Admin Table

| Column  | Type | Key               | Notes               |
| ------- | ---- | ----------------- | ------------------- |
| adminId | INT  | PK                | Unique admin ID     |
| userId  | INT  | FK → User(userId) | Links to User table |

---

# 4️⃣ Bus Table

| Column      | Type    | Key | Notes            |
| ----------- | ------- | --- | ---------------- |
| busId       | INT     | PK  | Unique bus ID    |
| plateNumber | VARCHAR |     | Vehicle plate    |
| capacity    | INT     |     | Total seats      |
| busType     | VARCHAR |     | e.g., AC, Non-AC |
| status      | VARCHAR |     | Active/Inactive  |

---

# 5️⃣ Seat Table

| Column      | Type    | Key             | Notes                   |
| ----------- | ------- | --------------- | ----------------------- |
| seatId      | INT     | PK              | Unique seat ID          |
| busId       | INT     | FK → Bus(busId) | Bus that owns this seat |
| seatNumber  | VARCHAR |                 | e.g., 1A, 1B            |
| isAvailable | BOOLEAN |                 | Seat availability       |
| seatType    | VARCHAR |                 | e.g., Regular, Premium  |
| price       | DOUBLE  |                 | Seat fare               |

---

# 6️⃣ Route Table

| Column      | Type    | Key | Notes               |
| ----------- | ------- | --- | ------------------- |
| routeId     | INT     | PK  | Unique route ID     |
| source      | VARCHAR |     | Starting point      |
| destination | VARCHAR |     | Ending point        |
| fare        | DOUBLE  |     | Base fare for route |

---

# 7️⃣ Booking Table

| Column      | Type    | Key                         | Notes                               |
| ----------- | ------- | --------------------------- | ----------------------------------- |
| bookingId   | INT     | PK                          | Unique booking ID                   |
| passengerId | INT     | FK → Passenger(passengerId) | Passenger making the booking        |
| routeId     | INT     | FK → Route(routeId)         | Route booked                        |
| bookingDate | DATE    |                             | Booking creation date               |
| status      | VARCHAR |                             | e.g., Pending, Confirmed, Cancelled |
| totalAmount | DOUBLE  |                             | Total amount paid                   |

---

# 8️⃣ Payment Table

| Column        | Type    | Key                     | Notes                     |
| ------------- | ------- | ----------------------- | ------------------------- |
| paymentId     | INT     | PK                      | Unique payment ID         |
| bookingId     | INT     | FK → Booking(bookingId) | Booking linked to payment |
| amount        | DOUBLE  |                         | Paid amount               |
| paymentMethod | VARCHAR |                         | e.g., Card, Mobile Money  |
| paymentStatus | VARCHAR |                         | Success/Failed/Pending    |
| paymentDate   | DATE    |                         | Payment timestamp         |

---

# 9️⃣ Ticket Table
| Column       | Type    | Key                     | Notes                    |
| ------------ | ------- | ----------------------- | ------------------------ |
| ticketId     | INT     | PK                      | Unique ticket ID         |
| bookingId    | INT     | FK → Booking(bookingId) | Booking linked to ticket |
| ticketNumber | VARCHAR |                         | Unique ticket code       |
| qrCode       | VARCHAR |                         | QR code value            |
| issueDate    | DATE    |                         | Ticket issue date        |
| isValidated  | BOOLEAN |                         | Validated at boarding    |

---

# 🔟 AIChatbot Table *(Optional / Logs)*

| Column    | Type     | Key               | Notes                     |
| --------- | -------- | ----------------- | ------------------------- |
| chatbotId | INT      | PK                | Unique bot session ID     |
| userId    | INT      | FK → User(userId) | User interacting with bot |
| botName   | VARCHAR  |                   | Bot instance name         |
| language  | VARCHAR  |                   | e.g., EN, AM              |
| status    | VARCHAR  |                   | Active / Closed           |
| message   | TEXT     |                   | Message sent/received     |
| timestamp | DATETIME |                   | Chat timestamp            |
