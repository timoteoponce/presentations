package main

import "fmt"

func main() {
	loginfo := func(str string) {
		fmt.Printf("INFO %s", str)
	}

	loginfo("My name is Timoteo")
}
