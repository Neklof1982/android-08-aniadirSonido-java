package com.example.a08_practica_aniadir_sonido;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
// aniadir la libreria MediaPAYER
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {


    //Declarar el bojeto MediaPlayer
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button buttonAIR = findViewById(R.id.buttonAIR);
        Button buttonOIL = findViewById(R.id.buttonOIL);
        Button buttonP1 = findViewById(R.id.buttonP1);
        Button buttonP2 = findViewById(R.id.buttonP2);
        Button buttonP3 = findViewById(R.id.buttonP3);
        Button buttonP4 = findViewById(R.id.buttonP4);
        Button buttonS1 = findViewById(R.id.buttonS1);
        Button buttonS2 = findViewById(R.id.buttonS2);
        Button buttonNormalCruise = findViewById(R.id.buttonNormalCruise);
        Button buttonAutoCruise = findViewById(R.id.buttonAutoCruise);
        Button buttonPursuit = findViewById(R.id.buttonPursuit);


        buttonAIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.air);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonOIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.oil);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();


                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.suno);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.sdos);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.puno);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.pdos);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.ptres);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.pcuatro);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonAutoCruise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.autocruise);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonNormalCruise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir el audio
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.normalcruise);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });

        buttonPursuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Deshabilitar los botones al iniciar el audio
                disableAllButtons();

                // Crear y reproducir mejor audio, recortado para que no dure mucho
                MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.pursuit);
                mp.start();

                // Liberar el MediaPlayer y habilitar el botón al finalizar
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Liberar recursos del MediaPlayer
                        mediaPlayer.release();
                        // Habilitar los botones al finalizar el audio
                        enableAllButtons();
                    }
                });
            }
        });



    }

    /**
     * Metodo para cuando un sonido es largo, no se pueda pulsar otro botn
     * hasta que acabe, desactiva todos los botones
     * sino se pisaban con sonidos algo más largo
     */
    private void disableAllButtons() {
        findViewById(R.id.buttonAIR).setEnabled(false);
        findViewById(R.id.buttonOIL).setEnabled(false);
        findViewById(R.id.buttonS1).setEnabled(false);
        findViewById(R.id.buttonS2).setEnabled(false);
        findViewById(R.id.buttonP1).setEnabled(false);
        findViewById(R.id.buttonP2).setEnabled(false);
        findViewById(R.id.buttonP3).setEnabled(false);
        findViewById(R.id.buttonP4).setEnabled(false);
        findViewById(R.id.buttonNormalCruise).setEnabled(false);
        findViewById(R.id.buttonAutoCruise).setEnabled(false);
        findViewById(R.id.buttonPursuit).setEnabled(false);

    }

    /**
     * Contrario al anterior, los vuele activar para
     * que pueda tocar de nuevo
     */
    private void enableAllButtons() {
        // Habilitar botones. Ajusta según tus IDs.
        findViewById(R.id.buttonAIR).setEnabled(true);
        findViewById(R.id.buttonOIL).setEnabled(true);
        findViewById(R.id.buttonS1).setEnabled(true);
        findViewById(R.id.buttonS2).setEnabled(true);
        findViewById(R.id.buttonP1).setEnabled(true);
        findViewById(R.id.buttonP2).setEnabled(true);
        findViewById(R.id.buttonP3).setEnabled(true);
        findViewById(R.id.buttonP4).setEnabled(true);
        findViewById(R.id.buttonNormalCruise).setEnabled(true);
        findViewById(R.id.buttonAutoCruise).setEnabled(true);
        findViewById(R.id.buttonPursuit).setEnabled(true);
    }
}

