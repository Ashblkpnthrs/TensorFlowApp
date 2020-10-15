package fr.infostrates.tensorflowtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout faceDetection = findViewById(R.id.face_layout);
        ConstraintLayout objectDetection = findViewById(R.id.object_layout);
        ConstraintLayout petDetection = findViewById(R.id.pet_layout);
        ConstraintLayout poseDetection = findViewById(R.id.pose_layout);
        ConstraintLayout segmentationDetection = findViewById(R.id.segmentation_layout);

        faceDetection.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),DetectorActivity.class);
            startActivity(intent);
        });

        objectDetection.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),DetectorActivityObject.class);
            startActivity(intent);
        });

        petDetection.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),DetectorActivityPet.class);
            startActivity(intent);
        });

        poseDetection.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),CameraActivityPose.class);
            startActivity(intent);
        });

        segmentationDetection.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),ImageSegmentationActivity.class);
            startActivity(intent);
        });

    }
}