# DebugTrace

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss", Locale.getDefault());
        String logDate = dateFormat.format(new Date());
        // Applies the date and time to the name of the trace log.
        Debug.startMethodTracing("sample-" + logDate);
    }
}
```

File location `/Penyimpanan internal/Android/data/com.gzeinnumer.debugtrace.file/sample-20_12_2020_12_09_10.trace`

---

```
Copyright 2020 M. Fadli Zein
```