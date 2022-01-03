package com.beit_and_pear.android.menusample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView _lvMenu;
    private List<Map<String, Object>> _menuList;
    private static final String[] FROM = {"name", "price"};
    private static final int[] TO = {R.id.tvMenuNameRow, R.id.tvMenuPriceRow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _lvMenu = findViewById(R.id.lvMenu);
        _menuList = createTeishokuList();
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());

    }

    // 定食リスト
    private List<Map<String, Object>> createTeishokuList() {
        ListView lvMenu = findViewById(R.id.lvMenu);
        List<Map<String, Object>> menuList = new ArrayList<>();
        Map<String, Object> menu = new HashMap<>();

        menu.put("name", "唐揚げ定食");
        menu.put("price", 800);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 900);
        menu.put("desc", "若鶏の唐揚げにサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "人間定食");
        menu.put("price", 10000);
        menu.put("desc", "人間にはサラダ、ご飯とお味噌汁がつきます。");

        menuList.add(menu);

        return menuList;
    }

    // カレーリスト
    private List<Map<String, Object>> createCurryList() {
        List<Map<String, Object>> menuList = new ArrayList<>();
        Map<String, Object> menu = new HashMap<>();
        menu.put("name", "ビーフカレー");
        menu.put("price", 500);
        menu.put("desc", "特選のスパイスを帰化したカレー");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカレー");
        menu.put("price", 600);
        menu.put("desc", "筋肉ん");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ビンビンマッチョ");
        menu.put("price", 5000);
        menu.put("desc", "nikumann");
        menuList.add(menu);

        return menuList;
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String, Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
            String menuName = (String) item.get("name");
            Integer menuPrice = (Integer) item.get("price");

            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            intent.putExtra("menuName", menuName);
            intent.putExtra("menuPrice", menuPrice + "円");

            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューインフレータの取得
        MenuInflater inflater = getMenuInflater();
        // オプションメニュー用.xmlファイルをインフレート
        inflater.inflate(R.menu.menu_options_menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        boolean returnVal = true;
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.menuListOptionTeishoku:
                _menuList = createTeishokuList();
                break;
            case R.id.menuListOptionCurry:
                _menuList = createCurryList();
                break;
            default:
                returnVal = super.onOptionsItemSelected(item);
                break;
        }
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);
        return returnVal;
    }
}