package lotto;

import java.util.List;

public class LottoController {
    private int paid;
    private List<Lotto> totalLotto;

    public void issueLotto() {
        UserInput userInput = new UserInput();
        LottoStorage lottoStorage = new LottoStorage();
        OutputView outputView = new OutputView();

        this.paid = userInput.inputMoney();
        this.totalLotto = lottoStorage.lottoStore(paid);
        outputView.printTotalLotto(totalLotto);
    }

    public void calculateWinningStatastic() {
        UserInput userInput = new UserInput();
        WinningStatistic winningStatistics = new WinningStatistic();
        OutputView outputView = new OutputView();

        List<Integer> winningNumbers = userInput.inputWinningNumber();
        int bonusNumber = userInput.inputBonusNumber(winningNumbers);
        WinningLotto winningLotto = new WinningLotto(winningNumbers, bonusNumber);
        winningStatistics.countCalculate(totalLotto, winningLotto);
        long totalPrize = winningStatistics.calculateTotalPrize();
        double rateOfReturn = winningStatistics.calculateRateOfReturn(paid, totalPrize);

        outputView.printWinningStatistic(rateOfReturn);
    }
    public void play() {
        issueLotto();
        calculateWinningStatastic();
    }
}
