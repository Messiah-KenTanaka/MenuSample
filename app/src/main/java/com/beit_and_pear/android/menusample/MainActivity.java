package com.beit_and_pear.android.menusample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

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

        //コンテキストメニュー（長押し）を検知するビュー
        registerForContextMenu(_lvMenu);
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
            // 注文処理
            order(item);
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

    // コンテキストメニューを表示
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        // 親クラスの同名メソッドの呼び出し
        super.onCreateContextMenu(menu, v, menuInfo);
        // メニューインフレーターの取得
        MenuInflater inflater = getMenuInflater();
        // コンテキストメニュー用.xmlファイルをインフレート
        inflater.inflate(R.menu.menu_context_menu_list, menu);
        // コンテキストメニューのヘッダタイトルを設定
        menu.setHeaderTitle(R.string.menu_list_context_header);
    }

    private void order(Map<String, Object> menu) {
        // 定食名と金額を取得。Mapの値部分がObject型なのでキャストが必要
        String menuName = (String) menu.get("name");
        Integer menuPrice = (Integer) menu.get("price");
        // インテントオブジェクトを生成
        Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
        // 第二画面に送るデータを格納
        intent.putExtra("menuName", menuName);
        //MenuThanksActivityでのデータ受け取りとあわせるため、金額にここで「円」を追加
        intent.putExtra("menuPrice", menuPrice + "円");
        // 第二画面の起動
        startActivity(intent);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        // 戻り値用の変数を初期値trueで用意
        boolean returnVal = true;
        // 長押しされたビューに関する情報が格納されたオブジェクトを取得
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        // 長押しされたリストのポジション
        int listPosition = info.position;
        // ポジションから長押しされたメニュー情報Mapオブジェクトを取得
        Map<String, Object> menu = _menuList.get(listPosition);


        // 選択されたメニューのIDを取得
        int itemId = item.getItemId();
        // IDのR値による処理の分岐
        switch(itemId) {
            case R.id.menuListContextDesc:
                // メニューの説明文字列を取得
                String desc = (String) menu.get("desc");
                // トーストを表示
                Toast.makeText(MainActivity.this, desc, Toast.LENGTH_LONG).show();
                break;
            case R.id.menuListContextOrder:
                order(menu);
                break;
            default:
                returnVal = super.onContextItemSelected(item);
                break;
        }
        return returnVal;
    }
}