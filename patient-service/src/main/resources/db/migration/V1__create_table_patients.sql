CREATE TABLE patients (
    id UUID PRIMARY KEY,
    family_name VARCHAR(255) NOT NULL,
    given_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    patient_code VARCHAR(50) NOT NULL UNIQUE,
    phone_number VARCHAR(50) NOT NULL UNIQUE,
    address VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    created_by VARCHAR(50),
    created_date TIMESTAMP,
    updated_by TIMESTAMP,
    updated_date TIMESTAMP
);

INSERT INTO patients (id, family_name, given_name, email, patient_code, phone_number, address, date_of_birth, created_by, created_date)
VALUES
  (RANDOM_UUID(), 'Sok', 'Dara', 'dara.sok@email.com', 'P001', '+85512345678', 'No. 12, Street 123, Phnom Penh, Cambodia', '1990-01-15', 'system', NOW()),
  (RANDOM_UUID(), 'Chan', 'Sophea', 'sophea.chan@email.com', 'P002', '+85516234567', 'No. 45, Street 456, Siem Reap, Cambodia', '1985-05-20', 'system', NOW()),
  (RANDOM_UUID(), 'Kim', 'Vannak', 'vannak.kim@email.com', 'P003', '+85517345678', 'No. 78, Street 789, Battambang, Cambodia', '1992-09-10', 'system', NOW()),
  (RANDOM_UUID(), 'Lim', 'Sreyneang', 'sreyneang.lim@email.com', 'P004', '+85511456789', 'No. 23, Street 234, Kampot, Cambodia', '1988-12-05', 'system', NOW()),
  (RANDOM_UUID(), 'Phan', 'Rith', 'rith.phan@email.com', 'P005', '+85510567890', 'No. 56, Street 567, Sihanoukville, Cambodia', '1995-03-25', 'system', NOW()); 