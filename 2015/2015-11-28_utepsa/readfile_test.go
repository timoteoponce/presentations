package main

import "testing"

func TestSinonimo(t *testing.T) {
	sino := Sinonimo("laguna")
	if sino != "curichi" {
		t.Error("Expected 'curichi' got ", sino)
	}
}
