# NahTabStrip

[![](https://jitpack.io/v/joelnah/NahTabStrip.svg)](https://jitpack.io/#joelnah/NahTabStrip)

    allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }

    dependencies {
              implementation 'com.github.joelnah:NahTabStrip:Tag'
      }

    nts_color 스트립 색상
    nts_size 타이틀 사이즈
    nts_weight 스트립 높이
    nts_factor 스트립 늘어나는 크기
    nts_titles 제목 @array/titles
    nts_side_weight 스트립 사이즈를 비율로 생성
    nts_fit_text 스트립 사이즈를 타이틀 사이즈로 생성(nts_side_weight과 혼용 불가) -우선권
    nts_bold
    nts_type 타입 선/점
    nts_gravity 스트립 위치 상/하
    nts_typeface 폰트
    nts_corners_radius 스트립 모서리 반경
    nts_animation_duration 애니메이션 시간
    nts_inactive_color 비활성 제목 생상
    nts_active_color 활성 제목 색상

    final NahTabStrip nahTabStrip = (NahTabStrip) findViewById(R.id.nts);
    nahTabStrip.setTitles("Nav", "Tab", "Strip");
    nahTabStrip.setTabIndex(0, true);
    nahTabStrip.setTitleSize(15);
    nahTabStrip.setStripColor(Color.RED);
    nahTabStrip.setStripWeight(6);
    nahTabStrip.setStripFactor(2);
    nahTabStrip.setStripType(NahTabStrip.StripType.LINE);
    nahTabStrip.setStripGravity(NahTabStrip.StripGravity.BOTTOM);
    nahTabStrip.setTypeface("fonts/typeface.ttf");
    nahTabStrip.setCornersRadius(3);
    nahTabStrip.setAnimationDuration(300);
    nahTabStrip.setInactiveColor(Color.GRAY);
    nahTabStrip.setActiveColor(Color.WHITE);
    nahTabStrip.setOnPageChangeListener(...);
    nahTabStrip.setOnTabStripSelectedIndexListener(...);

    <nah.prayer.nahtabstriplib.NahTabStrip
        android:id="@+id/tabStrip"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        app:nts_typeface="fonts/typeface.otf"
        app:nts_titles="@array/titles"
        app:nts_color="#8e2dd2"
        app:nts_size="15sp"
        app:nts_weight="3dp"
        app:nts_factor="2.5"
        app:nts_type="line"
        app:nts_gravity="bottom"
        app:nts_typeface="fonts/typeface.otf"
        app:nts_corners_radius="1.5dp"
        app:nts_animation_duration="200"
        app:nts_fit_text="true"
        app:nts_side_weight="2"
        app:nts_active_color="#000"
        app:nts_inactive_color="#c4c4c4"/>
