package com.escuelaing.arep.Heroku.Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.escuelaing.arep.Heroku.Services.mathServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/math")
public class mathController {

    @Autowired
    mathServices ms;

    // ================= Get ================= //
    @GetMapping("/sum.{a}&{b}")
    public ResponseEntity<?> getSum(@PathVariable String a, @PathVariable String b) {
        try {
            return new ResponseEntity<>(ms.sum(Integer.parseInt(a), Integer.parseInt(b)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/substrac.{a}&{b}")
    public ResponseEntity<?> getSubstract(@PathVariable String a, @PathVariable String b) {
        try {
            return new ResponseEntity<>(ms.substrac(Integer.parseInt(a), Integer.parseInt(b)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/multiply.{a}&{b}")
    public ResponseEntity<?> getMultiply(@PathVariable String a, @PathVariable String b) {
        try {
            return new ResponseEntity<>(ms.multiply(Integer.parseInt(a), Integer.parseInt(b)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/divide.{a}&{b}")
    public ResponseEntity<?> getDivide(@PathVariable String a, @PathVariable String b) {
        try {
            return new ResponseEntity<>(ms.divide(Integer.parseInt(a), Integer.parseInt(b)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/square.{a}&{b}")
    public ResponseEntity<?> getSquare(@PathVariable String a) {
        try {
            return new ResponseEntity<>(ms.square(Integer.parseInt(a)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/exponent.{a}&{b}")
    public ResponseEntity<?> getExponent(@PathVariable String a, @PathVariable String b) {
        try {
            return new ResponseEntity<>(ms.exponent(Integer.parseInt(a), Integer.parseInt(b)), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(mathController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found users", HttpStatus.NOT_FOUND);
        }
    }
}