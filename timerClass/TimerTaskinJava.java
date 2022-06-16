package uncategorised;

import java.util.*;

public class TimerTaskinJava {

	public static void main(String[] args) {

		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			int counter = 10;

			@Override
			public void run() {
				if (counter > 0) {
					System.out.println(counter + " seconds ");
					counter--;

				} else {
					System.out.println("Happy New Day!");
					timer.cancel();
				}
			}
		};

		Calendar date = Calendar.getInstance();

		date.set(Calendar.YEAR, 2022);

		date.set(Calendar.MONTH, Calendar.JUNE);
		date.set(Calendar.DAY_OF_MONTH, 16);
		date.set(Calendar.HOUR_OF_DAY, 15);
		date.set(Calendar.MINUTE, 12);
		date.set(Calendar.SECOND, 50);
		date.set(Calendar.MILLISECOND, 0);

		// System.out.println(date.get(Calendar.MINUTE));

		// timer.schedule(task, date.getTime());

		// timer.scheduleAtFixedRate(task, 0, 1000);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);

		// timer.schedule(task, 3000);

	}

}
