package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var arith1 = false
    var arith2 = false
    var arith3 = false
    var resultSet = false
    var cal1: String? = null
    var cal2: String? = null
    var cal3: String? = null
    var value1: Any = 0
    var value2: Any = 0
    var value3: Any = 0
    var value4: Any = 0
    var valueCal1: Any = 0
    var valueCal2: Any = 0
    var result: String? = null
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn0.setOnClickListener { appendNumber(0, binding) }
        binding.btn1.setOnClickListener { appendNumber(1, binding) }
        binding.btn2.setOnClickListener { appendNumber(2, binding) }
        binding.btn3.setOnClickListener { appendNumber(3, binding) }
        binding.btn4.setOnClickListener { appendNumber(4, binding) }
        binding.btn5.setOnClickListener { appendNumber(5, binding) }
        binding.btn6.setOnClickListener { appendNumber(6, binding) }
        binding.btn7.setOnClickListener { appendNumber(7, binding) }
        binding.btn8.setOnClickListener { appendNumber(8, binding) }
        binding.btn9.setOnClickListener { appendNumber(9, binding) }
        //Devide
        binding.btnDiv.setOnClickListener {
            if(resultSet == true){
                value1 = binding.tvMain.text.toString()
                if(arith1 != true){
                    binding.tvSub.append(" ÷ ")
                    arith1 = true
                    cal1 = "÷"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" ÷ ")
                        arith2 = true
                        cal2 = "÷"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" ÷ ")
                            arith3 = true
                            cal3 = "÷"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                resultSet = false
            }else{
                if(arith1 != true){
                    value1 = binding.tvMain.text.toString()
                    binding.tvSub.append(" ÷ ")
                    arith1 = true
                    cal1 = "÷"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" ÷ ")
                        arith2 = true
                        cal2 = "÷"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" ÷ ")
                            arith3 = true
                            cal3 = "÷"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        //Multiful
        binding.btnMul.setOnClickListener {
            if(resultSet == true){
                value1 = binding.tvMain.text.toString()
                if(arith1 != true){
                    binding.tvSub.append(" × ")
                    arith1 = true
                    cal1 = "×"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" × ")
                        arith2 = true
                        cal2 = "×"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" × ")
                            arith3 = true
                            cal3 = "×"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                resultSet = false
            }else{
                if(arith1 != true){
                    value1 = binding.tvMain.text.toString()
                    binding.tvSub.append(" × ")
                    arith1 = true
                    cal1 = "×"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" × ")
                        arith2 = true
                        cal2 = "×"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" × ")
                            arith3 = true
                            cal3 = "×"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        //Minus
        binding.btnMin.setOnClickListener {
            if(resultSet == true){
                value1 = binding.tvMain.text.toString()
                if(arith1 != true){
                    binding.tvSub.append(" - ")
                    arith1 = true
                    cal1 = "-"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" - ")
                        arith2 = true
                        cal2 = "-"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" - ")
                            arith3 = true
                            cal3 = "-"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                resultSet = false
            }else{
                if(arith1 != true){
                    value1 = binding.tvMain.text.toString()
                    binding.tvSub.append(" - ")
                    arith1 = true
                    cal1 = "-"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" - ")
                        arith2 = true
                        cal2 = "-"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" - ")
                            arith3 = true
                            cal3 = "-"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        //Plus
        binding.btnPlus.setOnClickListener {
            if(resultSet == true){
                value1 = binding.tvMain.text.toString()
                if(arith1 != true){
                    binding.tvSub.append(" + ")
                    arith1 = true
                    cal1 = "+"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" + ")
                        arith2 = true
                        cal2 = "+"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" + ")
                            arith3 = true
                            cal3 = "+"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                resultSet = false
            }else{
                if(arith1 != true){
                    value1 = binding.tvMain.text.toString()
                    binding.tvSub.append(" + ")
                    arith1 = true
                    cal1 = "+"
                    binding.tvMain.text = "0"
                }else if(arith1 == true){
                    if(arith2 != true){
                        value2 = binding.tvMain.text.toString()
                        binding.tvSub.append(" + ")
                        arith2 = true
                        cal2 = "+"
                        binding.tvMain.text = "0"
                    }else if (arith2 == true){
                        if(arith3 != true){
                            value3 = binding.tvMain.text.toString()
                            binding.tvSub.append(" + ")
                            arith3 = true
                            cal3 = "+"
                            binding.tvMain.text = "0"
                        }else if (arith3 == true){
                            Toast.makeText(binding.root.context, "연산자는 4개이상 입력할 수 없습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        //Equal
        binding.btnEqual.setOnClickListener {
            if(resultSet != true){
                if(arith3 == true){
                    value4 = binding.tvMain.text.toString()
                    if(value1.toString().contains(".") || value2.toString().contains(".") || value3.toString().contains(".") || value4.toString().contains(".")){
                        when(cal3){
                            "÷" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "×" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "-" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "+" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else {
                        when(cal3){
                            "÷" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value3.toString().toDouble() / value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "×" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble() * value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                result = "${value1.toString().toInt() * value2.toString().toInt() * value3.toString().toInt() * value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() - valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() + valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                valueCal2 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() - valueCal2.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() - value2.toString().toInt() - valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() + value2.toString().toInt() - valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                valueCal2 = String.format("%.8f", value3.toString().toDouble() * value4.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + valueCal2.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                valueCal2 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() + valueCal2.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() - value2.toString().toInt() + valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = "${value3.toString().toInt() * value4.toString().toInt()}"
                                                result = "${value1.toString().toInt() + value2.toString().toInt() + valueCal1.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "-" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${value1.toString().toInt() - valueCal1.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${value1.toString().toInt() + valueCal1.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() - value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = "${value1.toString().toInt() - value2.toString().toInt() - value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = "${value1.toString().toInt() + value2.toString().toInt() - value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() - value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() + value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = "${value1.toString().toInt() - value2.toString().toInt() + value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = "${value1.toString().toInt() + value2.toString().toInt() + value3.toString().toInt() - value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                            "+" -> {
                                when(cal2){
                                    "÷" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                                result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "×" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${value1.toString().toInt() - valueCal1.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                                result = "${value1.toString().toInt() + valueCal1.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "-" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() - value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = "${value1.toString().toInt() - value2.toString().toInt() - value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = "${value1.toString().toInt() + value2.toString().toInt() - value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                    "+" -> {
                                        when(cal1){
                                            "÷" -> {
                                                valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                                result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble() + value4.toString().toDouble())
                                                binding.tvMain.setText(result)
                                            }
                                            "×" -> {
                                                valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                                result = "${valueCal1.toString().toInt() + value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "-" -> {
                                                result = "${value1.toString().toInt() - value2.toString().toInt() + value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                            "+" -> {
                                                result = "${value1.toString().toInt() + value2.toString().toInt() + value3.toString().toInt() + value4.toString().toInt()}"
                                                binding.tvMain.setText(result)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }else if(arith3 != true){
                    if(arith2 == true){
                        value3 = binding.tvMain.text.toString()
                        if(value1.toString().contains(".") || value2.toString().contains(".") || value3.toString().contains(".")){
                            when(cal2){
                                "÷" -> {
                                    when(cal1){
                                        "÷" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "×" -> {
                                    when(cal1){
                                        "÷" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() * value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() * value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "-" -> {
                                    when(cal1){
                                        "÷" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() - value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() - value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "+" -> {
                                    when(cal1){
                                        "÷" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() - value2.toString().toDouble() + value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() + value2.toString().toDouble() + value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                            }
                        }else {
                            when(cal2){
                                "÷" -> {
                                    when(cal1){
                                        "÷" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() / value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble() / value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            valueCal1 = String.format("%.8f", value2.toString().toDouble() / value3.toString().toDouble())
                                            result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "×" -> {
                                    when(cal1){
                                        "÷" -> {
                                            result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble() * value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            result = "${value1.toString().toInt() * value2.toString().toInt() * value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                            result = "${value1.toString().toInt() - valueCal1.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            valueCal1 = "${value2.toString().toInt() * value3.toString().toInt()}"
                                            result = "${value1.toString().toInt() + valueCal1.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "-" -> {
                                    when(cal1){
                                        "÷" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() - value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                            result = "${valueCal1.toString().toInt() - value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            result = "${value1.toString().toInt() - value2.toString().toInt() - value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            result = "${value1.toString().toInt() + value2.toString().toInt() - value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                                "+" -> {
                                    when(cal1){
                                        "÷" -> {
                                            valueCal1 = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                            result = String.format("%.8f", valueCal1.toString().toDouble() + value3.toString().toDouble())
                                            binding.tvMain.setText(result)
                                        }
                                        "×" -> {
                                            valueCal1 = "${value1.toString().toInt() * value2.toString().toInt()}"
                                            result = "${valueCal1.toString().toInt() + value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "-" -> {
                                            result = "${value1.toString().toInt() - value2.toString().toInt() + value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                        "+" -> {
                                            result = "${value1.toString().toInt() + value2.toString().toInt() + value3.toString().toInt()}"
                                            binding.tvMain.setText(result)
                                        }
                                    }
                                }
                            }
                        }
                    }else if(arith2 != true){
                        if(arith1 == true){
                            value2 = binding.tvMain.text.toString()
                            if(value1.toString().contains(".") || value2.toString().contains(".")){
                                when(cal1){
                                    "÷" -> {
                                        result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                        binding.tvMain.setText(result)
                                    }
                                    "×" -> {
                                        result = String.format("%.8f", value1.toString().toDouble() * value2.toString().toDouble())
                                        binding.tvMain.setText(result)
                                    }
                                    "-" -> {
                                        result = String.format("%.8f", value1.toString().toDouble() - valueCal1.toString().toDouble())
                                        binding.tvMain.setText(result)
                                    }
                                    "+" -> {
                                        result = String.format("%.8f", value1.toString().toDouble() + valueCal1.toString().toDouble())
                                        binding.tvMain.setText(result)
                                    }
                                }
                            }else {
                                when(cal1){
                                    "÷" -> {
                                        result = String.format("%.8f", value1.toString().toDouble() / value2.toString().toDouble())
                                        binding.tvMain.setText(result)
                                    }
                                    "×" -> {
                                        result = "${value1.toString().toInt() * value2.toString().toInt()}"
                                        binding.tvMain.setText(result)
                                    }
                                    "-" -> {
                                        result = "${value1.toString().toInt() - value2.toString().toInt()}"
                                        binding.tvMain.setText(result)
                                    }
                                    "+" -> {
                                        result = "${value1.toString().toInt() + value2.toString().toInt()}"
                                        binding.tvMain.setText(result)
                                    }
                                }
                            }
                        }else if(arith1 != true){
                            if(value1.toString().contains(".")){
                                result = "${value1.toString().toDouble()}"
                                binding.tvMain.setText(result)
                            }else{
                                result = "${value1.toString().toInt()}"
                                binding.tvMain.setText(result)
                            }
                        }
                    }
                }
                resultSet = true
                arith1 = false
                arith2 = false
                arith3 = false
            }else{
                Toast.makeText(this, "초기화 됩니다.", Toast.LENGTH_SHORT).show()
                value1 = 0
                value2 = 0
                value3 = 0
                value4 = 0
                arith1 = false
                arith2 = false
                arith3 = false
                cal1 = ""
                cal2 = ""
                cal3 = ""
                result = ""
                resultSet = false
                binding.tvMain.text = "0"
                binding.tvSub.text = ""
            }

        }
        //Clear
        binding.btnC.setOnClickListener {
            value1 = 0
            value2 = 0
            value3 = 0
            value4 = 0
            arith1 = false
            arith2 = false
            arith3 = false
            cal1 = ""
            cal2 = ""
            cal3 = ""
            result = ""
            resultSet = false
            binding.tvMain.text = "0"
            binding.tvSub.text = ""
        }
        //Back
        binding.btnBack.setOnClickListener {
            binding.tvMain.setText(binding.tvMain.text.dropLast(1))
            binding.tvSub.setText(binding.tvSub.text.dropLast(1))
        }
        //Dot
        binding.btnDot.setOnClickListener {
            if (binding.tvMain.text.length == 0){
                binding.tvMain.append("0.")
            } else {
                binding.tvMain.append(".")
            }
        }
    }

    fun appendNumber(num: Int, binding: ActivityMainBinding) {
        if(resultSet == true){
            value1 = binding.tvMain.text.toString()
            binding.tvSub.setText("= " + binding.tvMain.text)
            if (binding.tvMain.text.toString() == "0"){
                binding.tvMain.setText("${num}")
                binding.tvMain.append("${num}")
            } else {
                binding.tvMain.append("${num}")
                binding.tvMain.append("${num}")
            }
        }
        if (binding.tvMain.text.toString() == "0"){
            binding.tvMain.setText("${num}")
            binding.tvSub.append("${num}")
        } else {
            binding.tvMain.append("${num}")
            binding.tvSub.append("${num}")
        }
    }
}