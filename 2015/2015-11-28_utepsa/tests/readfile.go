package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	file, err := os.Open("golang.slide")

	if err != nil {
		fmt.Printf("Error while opening file %v\n", err)

	} else {
		defer file.Close()
		scanner := bufio.NewScanner(file)
		for scanner.Scan() {
			fmt.Printf("\t > %s\n", scanner.Text())
		}
	}
}

func Sinonimo(word string) string {
	switch word {
	case "laguna":
		return "curichi"
		break
	case "tacaño":
		return "pichon"
		break
	}
	return ""
}
