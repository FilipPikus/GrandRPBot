# GrandRPBot

> [!WARNING]  
> This project is for educational purposes only.  
> Use it only in environments where automation is allowed.

## Description

GrandRPBot is a small Java automation project that uses the Java `Robot` class to simulate simple keyboard input.

The program automatically presses the `W` and `S` keys in a fixed interval.  
By default, the movement action is repeated every 30 seconds.

## Features

- Simple Java-based keyboard automation
- Uses `java.awt.Robot`
- Automatically presses `W` and `S`
- Default interval: 30 seconds
- Small and easy-to-understand source code
- Maven project structure

## How It Works

The bot creates a Java `Robot` instance and uses a timer to repeat a movement sequence.

The sequence is:

1. Wait a short random delay
2. Press `W`
3. Release `W`
4. Wait a short random delay
5. Press `S`
6. Release `S`
7. Repeat after 30 seconds

## Requirements

- Java 8 or newer
- Maven
- Windows, Linux, or macOS with desktop input support

## Build

Clone the repository:

```bash
git clone https://github.com/FilipPikus/GrandRPBot.git
cd GrandRPBot
