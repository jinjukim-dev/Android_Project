package com.example.sumin.mymuseum;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sumin on 2018-07-17.
 */

public class RoomActivity extends Activity{

    ImageView ivContent;
    TextView tvContent,tvTitle;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room);

        ivContent = (ImageView)findViewById(R.id.ivContent);
        tvContent = (TextView)findViewById(R.id.tvContent);
        tvTitle = (TextView)findViewById(R.id.tvTitle);

        final String[] first = new String[]{"② 전쟁역사실 Ⅰ , Ⅱ"};
        final String[] second = new String[]{"① 호국추모실", "③ 6.25전쟁실 Ⅰ", "④ 6.25전쟁실 Ⅱ", "⑨ 대형장비실"};
        final String[] thrid = new String[]{"⑤ 유엔실", "⑥ 기증실", "⑦ 해외파병실", "⑧ 국군발전실"};

        final String[] firstContent = new String[]{"선사시대, 삼국시대, 남북국시대, 고려시대, 조선시대, 개항기, 대한제국기, 일제강점기의 모습을 보여주고 있다."};
        final String[] secondContent = new String[]{"우리나라가 역사상 수많은 전쟁을 겪고 오늘의 대한민국으로 계승 발전할 수 있었던 것은 선열들의 호국정신이 그 근간이 되었다. 호국추모실은 삼국시대로부터 현재에 이르기까지 전쟁 및 전투에서 나라 위해 헌신한 호국선열의 위업을 기리고 추모하는 곳이다. 2층 중앙홀에서 이어지는 호국추모실은 통로에 무명용사를 비롯한 호국영령의 넋을 열주기둥과 호국의 별로 표현하였으며 <창조>, <겨레의 얼>, <호국의 발자취>,작품으로 구성되어 있다."
                , "6.25전쟁의 배경, 남침, 반격, 전쟁지도실을 보여주고 있다.",
                "6.25전쟁의 북진, 중공군 개입, 전선교착, 휴전을 보여주고 있다."
                , "6·25전쟁 당시 남북한이 보유했던 주요 전투장비와 함께 국내 최초로 공중전시를 통해 공중무기들의 다양한 모습을 보여주고 있다. 또한 근대 등록문화재로 등재된 이승만 대통령의 의전차량과 김일성 승용차를 실물 그대로 복원하여 전시하였다."};
        final String[] thridContent = new String[]{"발견의 장, 기억의 장, 약속의 장을 보여주고 있다."
                , "전쟁기념관 개관 이래 현재까지 1,128명으로부터 기증받은 1만 5,000여 점의 유물 가운데 986점을 전시하고 있다. 전시된 각각의 유물은 전쟁에 직접 참여하거나 경험했던 분들의 사연과 함께 대한민국이 전쟁을 통해 겪은 교훈의 역사가 담겨 있다. 복식, 도서, 훈장, 지도, 탄약류 등의 유물은 물론, 문서 및 무기류 등 평소 쉽게 접할 수 없는 귀중한 유물도 다수 포함되어 있어 전쟁의 교훈을 후대에 전하고자 하는 기증자의 마음과 기증의 중요성을 보여주고 있다."
                , "베트남전쟁 파병과 분쟁국가 파병을 보여주고 있다."
                , "국군의 역사, 북한의 도발, 동맹과 협력, 오늘의 국군, 미래의 국군을 보여주고 있다."};

        final int [] firstImg = new int[]{R.drawable.img1};
        final int [] secondImg = new int[]{R.drawable.img2_1,R.drawable.img2_2,R.drawable.img2_3,R.drawable.img2_4};
        final int [] thridImg = new int[]{R.drawable.img3_1,R.drawable.img3_2,R.drawable.img3_3,R.drawable.img3_4};

        Intent intent = getIntent();
        final int index = intent.getIntExtra("index", 0);
        final int i = intent.getIntExtra("i", 0);

//        tvContent.setText(index+"i="+i);

        switch (index) {
            case 0:
                tvTitle.setText(first[i]);
                tvContent.setText(firstContent[i]);
                ivContent.setImageResource(firstImg[i]);
                break;
            case 1:
                tvTitle.setText(second[i]);
                tvContent.setText(secondContent[i]);
                ivContent.setImageResource(secondImg[i]);
                break;
            case 2:
                tvTitle.setText(thrid[i]);
                tvContent.setText(thridContent[i]);
                ivContent.setImageResource(thridImg[i]);
                break;
        }
    }
}