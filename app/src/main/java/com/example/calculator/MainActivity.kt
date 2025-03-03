package com.example.calculator

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

        binding.btnac.setOnClickListener{
            binding.textinput.setText("0")
            binding.textEdit.setText("0")
        }

        binding.btndecimal.setOnClickListener{
            binding.textinput.append(".")
            binding.textEdit.append(".")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
//        binding.btnclear.setOnClickListener{
//            binding.textinput.
//        }

        binding.btn0.setOnClickListener{
            binding.textinput.append("0")
            binding.textEdit.append("0")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn1.setOnClickListener{
            binding.textinput.append("1")
            binding.textEdit.append("1")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }

        binding.btn2.setOnClickListener{
            binding.textinput.append("2")
            binding.textEdit.append("2")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }

        binding.btn3.setOnClickListener{
            binding.textinput.append("3")
            binding.textEdit.append("3")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn4.setOnClickListener{
            binding.textinput.append("4")
            binding.textEdit.append("4")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn5.setOnClickListener{
            binding.textinput.append("5")
            binding.textEdit.append("5")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn6.setOnClickListener{
            binding.textinput.append("6")
            binding.textEdit.append("6")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn7.setOnClickListener{
            binding.textinput.append("7")
            binding.textEdit.append("7")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn8.setOnClickListener{
            binding.textinput.append("8")
            binding.textEdit.append("8")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btn9.setOnClickListener{
            binding.textinput.append("9")
            binding.textEdit.append("9")
            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
            binding.textEdit.setText(res.toString())
            //binding.textinput.text=res.toString()
        }
        binding.btnplus.setOnClickListener{
            binding.textinput.append("+")

        }
        binding.btnsub.setOnClickListener{
            binding.textinput.append("-")
            val exp=binding.textinput.text

        }
        binding.btnmulti.setOnClickListener{
            binding.textinput.append("*")

        }
        binding.btndivid.setOnClickListener {
            binding.textinput.append("/")


        }
        binding.btnpercent.setOnClickListener {
            binding.textinput.append("%")
            val exp=binding.textinput.text

        }

        binding.btnclear.setOnClickListener {
            val currentText = binding.textinput.text.toString()
            if (currentText.isNotEmpty()) {

                binding.textinput.setText( currentText.dropLast(1)) // Remove last character
                    binding.textEdit.setText(currentText.dropLast(1))
            }
        }

        binding.btnequl.setOnClickListener {

            val exp=binding.textinput.text
            val res= ExpressionBuilder(exp.toString()).build().evaluate()
           binding.textEdit.setText(res.toString())
            binding.textinput.setText(res.toString())


        }

    }
}