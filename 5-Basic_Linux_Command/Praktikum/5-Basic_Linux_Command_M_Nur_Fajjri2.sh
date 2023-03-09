#!/bin/bash

# Define a function to generate a random password
generate_password() {
  tr -dc A-Za-z0-9_ < /dev/urandom | head -c 16
  echo
}

# Call the function to generate a password and print it to the console
echo "Your new password is:"
generate_password

read -t 5 -p "command finish"