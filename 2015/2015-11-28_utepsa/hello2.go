package main

import "fmt"

func main() {
	items := []string{"rory", "eduardo", "marius"}
	for str := range items {
		fmt.Printf("Hello %s\n", str)
	}
}
