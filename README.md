
# Rapport


Jag började med att skapa 2 edittext element i activity_main.xml och en button och gav de id.
Kodexempel 1
```
    <EditText
        android:id="@+id/editTextName"
        .../>

    <EditText
        android:id="@+id/editTextAge"
        .../>

    <Button
        android:id="@+id/clickbutton"
        .../>
```
Jag skapade sedan en ny activity som jag döpte till activity_second, i den skapade 2 text views som skulle visa datan som matas in på den första sidan.
Kodexempel 2
```
    <TextView
        android:id="@+id/textViewName"
        .../>

    <TextView
        android:id="@+id/textViewAge"
        .../>
```
Jag skapade sedan variabler som jag länkade till mina edittext element och buttons id.
Sen skapade jag en onclicklistener som jag koppalde till min buttons variabel.
I onclicklistenern skapade jag en intent vars uppgift var att öppna min andra activity, jag skickade
då även med datan från mina edittext variabler med hjälp av putextra kommandot.
Kodexempel 3
```
    Button clickbutton = findViewById(R.id.clickbutton);
    final EditText age = findViewById(R.id.editTextAge);
    final EditText name = findViewById(R.id.editTextName);

    clickbutton.setOnClickListener(new View.OnClickListener() {
    @Override
        public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, activity_second.class);
        intent.putExtra("name", name.getText().toString()); // Optional
        intent.putExtra("age",age.getText().toString()); // Optional
        startActivity(intent);
    }
```
I min andra activity började jag med att hämta min intent och spara ner datan som jag skickade med 
i nya variabler med namnen name och age. Sen använde jag settext kommandot på mina textviews för att
skriva ut värdet av variablerna i de textviews som jag skapade i den andra activityn.
```
    String name ="";
    String age ="";

    Intent intent = getIntent();
        if (intent != null){
            name = intent.getStringExtra("name");
            age = intent.getStringExtra("age");
        }
        TextView TextViewName =findViewById(R.id.textViewName);
        TextView TextViewAge =findViewById(R.id.textViewAge);

        TextViewName.setText(name);
        TextViewAge.setText(age);
```


![](sc1)

Figur 1 Exempelbild över hur data kan matas in i main activity

![](sc2)

Figur 2 Exempelbild över hur datan visas i second activity
